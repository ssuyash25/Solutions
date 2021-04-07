function fib(n, f=0, s=1){
    if(n === 2){
        return f+s;
    }
    return fib(n-1, s, f+s);
}

console.log(fib(3));
