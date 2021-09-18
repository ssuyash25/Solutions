// Find kth largest no. in an Array
function largest(a, k) {
    for(let i=0; i<k; i++){
        for(let j=i+1; j<a.length; j++){
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


// function klargest(a, k){
//     //sort the array
//     let heap = [-Infinity]
//     for(let i=0; i< a.length -1; i++){
//         if(a[i] > heap[0]){
//             if(heap )
//         }
//     }
// }