function threeSum(a) {
    let ls = [];
    let j = 0;
    let k = 0;
    for (let i = 0; i < a.length; i++) {
        j = 1 + i;
        while (j < a.length) {
            k = 2 + i;
            while (k < a.length) {
                //console.log(i, " ",j, " ", k)
                //console.log(a[i] + a[j] + a[k])
                if (a[i] + a[j] + a[k] === 0) {
                    ls.push([a[i] , a[j] , a[k]]);
                }
                k++;
            }
            j++;
        }
    }
    return ls;
}

console.log(threeSum([-1, 2, 3, 1, 0, -2, -3]))