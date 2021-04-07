 function init() {
    console.log(1);
    console.log(2);
    //console.log(this)
  }
  
 function sleep() {
  console.log(this)
    console.log(init())
  }   

  sleep()
  console.log(this)
