package co.ljb.prj.board.vo;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BoardVO {
	private int boardId;
	private String boardName;
	private String boardTitle;
	private String boardContent;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date boardDate;
	private int boardHit;
}
