
function closest(n){
 let s = sum ([1,4,6,2],[5,6,2,4])
 console.log(s)
 let flag = true;
 let x = y = n;
 let close
 while(flag){
    for(let j=0; j<s.length; j++){
        if(x === s[j]){
            flag = false;
            close = x
            break
        } else if(y === s[j] ){
            flag = false;
            close = y
            break
        }
    }
    if(flag){
        x = x+1;
        y = y-1;
    }
 }
 console.log(close)
}

function sum (a, b){
    let s = new Array(a.length)
    // for(let j=0; j<a.length; j++){
    //  s[j] = new Array(b.length)}
    let k =0
    for(let i=0; i<a.length; i++){
        for(let j=0; j<b.length; j++){
            s[k++] = a[i] + b[j]
        }
    }

    return s;
}

closest(1)