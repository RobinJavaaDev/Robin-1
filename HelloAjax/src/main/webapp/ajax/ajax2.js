/**
 * ajax2.js 
 */
 
 let val = 6;
 let promise = new Promise((resolve, reject)=>{
 	val -=1;
 	if(val > 0){
 	   resolve('success, ' + val);
 	} else {
 	   reject('error');
 	}
 });
 
 promise.then((result1, reject1) => {
          val-= 2;
          if(val>0){
          result1('success, ' + val)          
          } else {
          reject1('error');
          }
 		})
        .catch();
 
 