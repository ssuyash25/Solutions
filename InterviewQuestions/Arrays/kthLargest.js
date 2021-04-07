// Find kth largest no. in an Array
function largest(a, k) {
    for(let i=0; i<k; i++){
        for(let j=1; j<a.length; j++){
            if(a[j]> a[i]){
                const temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
    }
    return a[k-1];
}

console.log(largest([4,7,6,5,8], 4))