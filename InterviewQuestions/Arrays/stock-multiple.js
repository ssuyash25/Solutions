
function maxProfit(a){

    let min = a[0];
    let profit = 0;
    for(let i=2; i< a.length; i++){
        if(a[i] < a[i-1]){
            profit = profit + (a[i-1] - min)
            min = a[i];
        }
       
    }
    if(a[a.length -1] > min){
        profit = profit + (a[a.length-1] - min)
    }
    return profit;
}

console.log(maxProfit([100,180,260,310,40,535,695]))