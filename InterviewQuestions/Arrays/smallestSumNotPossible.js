
function smallest(a){
    let res = 1;
    for(let i=0; i<a.length && a[i] <= res; i++){
        res = res + a[i]
     }
    console.log(res)
}

smallest([1, 3, 6, 10, 11, 15])