
function maxProfit(weight, price, n, w){
    if(w == 0 || n ==0 )
    return 0;

    let inc=0, exc =0;

    if(weight[n-1] <= w){
        inc = price[n-1] + maxProfit(weight, price, n-1, w-weight[n-1])
    }

    exc = 0 + maxProfit(weight, price, n-1, w)

    return Math.max(inc, exc)
}

// Top Down DP
function maxProfitTDDP(weight, price, n, w){
    if(w == 0 || n ==0 )
    return 0;
    let dp
    let inc=0, exc =0;

    if(weight[n-1] <= w){
        inc = price[n-1] + maxProfit(weight, price, n-1, w-weight[n-1])
    }

    exc = 0 + maxProfit(weight, price, n-1, w)

    return Math.max(inc, exc)
}

// Bottom Up DP
function maxProfitBUDP(weight, price, n, w){
    let dp = new Array(n+1)
    for(let i=0; i<=n; i++){
        dp[i] = new Array(w+1)
    }
    
    for(let i=0; i<=n; i++){
        for(let j=0; j<=w; j++){
            if(i === 0 || j===0){
                dp[i][j] = 0;
            }
            let inc=0, exc =0;
            if(weight[i-1] <= j){
            inc = price[i-1] + dp[i-1][j-weight[i-1]]
            exc = dp[i-1][j]
            }
            dp[i][j] = Math.max(inc, exc)
        }
    }
    return dp[n][w]
}

console.log(maxProfit([2,7,3,4], [2,20,20,10], 4, 11))

console.log(maxProfitBUDP([2,7,3,4], [2,20,20,10], 4, 11))