a = [2,5,7,3,9,8]

function test(a){
    //run a loop gap of one to increasing upto dif is l-2
    const l = a.length;
    let dif = 1;
    let max = 0;
    while(dif !== l-2){
        for(let i=0, j=i+1+dif; i<l && j<l;i++,j++){
            console.log(a[i], a[j])
            if(max < a[i]+a[j]){
                max = a[i] + a[j];
            }
        }
        dif++;
    }
    // add and compare with max if true save a and b
    console.log(max)
}

test(a);