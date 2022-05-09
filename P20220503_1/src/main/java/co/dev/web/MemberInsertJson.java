package co.dev.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.dev.service.MemberService;
import co.dev.vo.MemberVO;

public class MemberInsertJson implements Control {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// multipart : request, saveDir, maxSize, encoding, renamePolicy
		response.setContentType("text/json;charset=utf-8");
		MemberVO vo = null;
		boolean isMulti = ServletFileUpload.isMultipartContent(request);

		if (isMulti) { // 멀티파트 요청
			String saveDir = "upload";
			saveDir = request.getServletContext().getRealPath(saveDir);
			int maxSize = 1024 * 1024 * 10;
			String encoding = "UTF-8";
			// multipart 요청.
			// request, 저장위치, 최대사이즈, 인코딩방식, 리네임정책. file.jpg, file1.jpg ...
			MultipartRequest multi = new MultipartRequest(request, saveDir, maxSize, encoding,
					new DefaultFileRenamePolicy());

			String id = multi.getParameter("id");
			String nm = multi.getParameter("name");
			String ps = multi.getParameter("passwd");
			String em = multi.getParameter("email");
			String pf = multi.getFilesystemName("profile");

			vo = new MemberVO();
			vo.setId(id);
			vo.setName(nm);
			vo.setPasswd(ps);
			vo.setEmail(em);
			vo.setProfile(pf);

			MemberService service = new MemberService();
			service.memberInsert(vo);

		} else { // key=value&key1=value1....
			String id = request.getParameter("id");
			String nm = request.getParameter("name");
			String ps = request.getParameter("passwd");
			String em = request.getParameter("email");

			vo = new MemberVO();
			vo.setId(id);
			vo.setName(nm);
			vo.setPasswd(ps);
			vo.setEmail(em);

			MemberService service = new MemberService();
			service.memberInsert(vo);
			//response.getWriter().print("{\"msg\": \"처리완료\"}");
		}
		// json 형태의 결과 반환
		Gson gson = new GsonBuilder().create();
		response.getWriter().print(gson.toJson(vo));
	}

}
