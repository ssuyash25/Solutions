// Minimum no. of coins required to give a sum
function coinChange(n , dom){   
    let dp = []
    dp[n] = n+1
    dp[0] = 0
    for(let i =1; i< n; i++){
         dp[i] = n+1
    }
    for(let i =1; i<= n; i++){
        for(let j =0; j< dom.length; j++){
            if(dom[j] <= i){
                dp[i] = Math.min(dp[i], 1+dp[i-dom[j]])
            }
        }
    }
    if(dp[n] !== n+1)
    return dp[n]
    else
    return -1
}

console.log(coinChange(14, [1,5,10,25]))