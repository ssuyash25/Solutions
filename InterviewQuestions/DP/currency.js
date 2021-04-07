
function minCoins(coins, amount, n) {
    //base case
    if (amount === 0) return 0;
    let coinsNeeded = Infinity;
    for (let i = 0; i < n; i++) {
        if (amount - coins[i] >= 0) {
            let smallerAmount = minCoins(coins, amount - coins[i], n);
            if (smallerAmount !== Infinity) {
                coinsNeeded = Math.min(coinsNeeded, smallerAmount + 1)
            }
        }
    }
    return coinsNeeded
}

function minCoinsDP(coins, amount, n) {
    //base case
    let dp = []
    for(let i =1; i<= amount; i++){
        dp[i] = Infinity;
    }
    dp[0] = 0
    for (let i = 1; i <= amount; i++) {
        //itterate over coins
        coins.forEach(coin => {
            if (coin <= i ) {
                let smallerAmount = dp[i-coin];
                if (smallerAmount !== Infinity) {
                    dp[i] = Math.min(dp[i], smallerAmount + 1)
                }
            }
        })
    }
    return dp[amount]
}

console.log(minCoins([1, 7, 10], 15, 3))

console.log(minCoinsDP([1, 7, 10], 15, 3))

// public int coinChange(int[] coins, int amount) {
//     int max = amount + 1;
//     int[] dp = new int[amount + 1];
//     Arrays.fill(dp, max);
//     dp[0] = 0;
//     for (int i = 1; i <= amount; i++) {
//       for (int j = 0; j < coins.length; j++) {
//         if (coins[j] <= i) {
//           dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
//         }
//       }
//     }
//     return dp[amount] > amount ? -1 : dp[amount];
//   }