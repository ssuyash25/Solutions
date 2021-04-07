
function fib(n,a){
    if(a[n] !== undefined){
    return a[n];}
    a[n] = fib(n-1, a) + fib(n-2, a)
    return a[n];
}

function calculate(n){
    let a=[];
    a[0] = 0
    a[1] = 1
    console.log(fib(n, a))
}

calculate(40)