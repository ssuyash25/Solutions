//method1
function rem(a){
    let b = []
    a.forEach(e => {
        if(!b.includes(e))
        b.push(e);
    })
    return b;
}

//method2
function rem2(a){
    let end = a.length -1;
    for(let i =0; i <= end ; i++){
        for(let j=i+1; j <= end; j++){
            if(a[i] === a[j]){
                let temp = a[end];
                a[end] = a[j];
                a[j] = temp;
                end--;
                j--;
            }
        }
    }
    return a.slice(0, end+1)
}

console.log(rem([1,4,5,6,5,1]))
console.log(rem2([1,4,5,6,5,1]))