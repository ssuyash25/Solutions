// Service Now
// [10,15,12,25,30,5,35,4, 40, 1, 39, 20]
// Buy once - sell once - Maximum Profit

function profit(a){
    let maxProfit = 0;
    let minmumPrice = a[0];
    for(let i =1; i < a.length; i++){
        if(minmumPrice > a[i])
            minmumPrice = a[i];
        if((a[i] - minmumPrice) > maxProfit)
            maxProfit = a[i] - minmumPrice;
    }
    return maxProfit;
}

function profit2(a){
    let maxProfit = 0;
    let minmumPrice = a[0];
    for(let i =1; i < a.length; i++){
        minmumPrice = minmumPrice > a[i] ? a[i] : minmumPrice;
        maxProfit = Math.max(maxProfit , a[i] - minmumPrice);
    }
    return maxProfit;
}

console.log(profit([10,15,12,25,30,5,35,4, 40, 1, 39, 20]))
console.log(profit([10,150,12,25,30,5,35,4, 40, 1, 39, 20]))
