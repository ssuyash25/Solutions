// Google
//Return the first duplicate, if no duplicates return -1
// Constrains : N : size of array, Array elements between 1 and N


//O(n)
function firstDuplicate(a){
    for(let i=0; i<a.length; i++){
        a[a[i]-1] = -1 * a[a[i]-1]
    }
    for(let i=0; i<a.length; i++){
       if(a[i] > 0)
       return a[i]  // Return first positive integer
    }
    return -1;
}


console.log(firstDuplicate([1,2,1,2,3,3]))

console.log(firstDuplicate([2,3,1,5,3,2]))

console.log(firstDuplicate([1,2,3,4,5,6]))