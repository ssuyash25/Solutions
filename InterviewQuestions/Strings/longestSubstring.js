//  length of longest substring without repeating characters 

function longest(s){
   let i = 0;
   let j = 1;
   let a = [s[0]];
   let max = 0;
   while(i < s.length && j < s.length) {
        if(!a.includes(s[j])){
            a.push(s[j]);
            j++;
            if(a.length > max)
            max = a.length;
        }else{
            a.slice(1)
            i++;
        }
   }
   console.log(max)
}


longest("xyzaxyz")