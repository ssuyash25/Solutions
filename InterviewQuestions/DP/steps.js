// rescurtion
function ways(n){
    if(n < 0) return 0;

    if(n === 0) return 1;

    return ways(n-1) + ways(n-2) + ways(n-3);

}

//DP
function dp(n, a){
     if(a[n]) return a[n]
     if(n < 0) return 0
     if(n === 0) return 1
     a [n] = dp(n-1, a) + dp(n-2, a) + dp(n-3, a)
     return a[n]
}

function dp2(n){
    let a = []
    a[0] = 1

    for(let i=1; i<=n; i++){
        let k = 1;
        while(k<=3 && i-k >= 0){
            a [i] = a[i] ? a[i] + a[i-k] : a[i-k]
            ++k
        }
    }
    return a[n]
}

//O(N)
function dp3(n){
    let a = []
    a[0] = 0
    a[1] = 1
    for(let i=1; i<=n; i++){
        a[i+1] = 2 * a[i] 
       if(i-3 >= 0){
          a[i+1] = a[i+1] - a[i-3]
         }   
    }   
    return a[n]
}

console.log(ways(4));
console.log(dp(4,[]));
console.log(dp2(4));
console.log(dp3(4));