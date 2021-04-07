// Given an integer,
//  if the number is prime, return 1.
//   Otherwise return its smallest divisor greater than 1.
//    e.g. if n = 24, its divisors are [1, 2, 3, 4, 6, 8, 12, 24].
//     The smallest divisor greater than 1 is 2.  

// function small(n){
//     let i=2;
//     while(i< n){
//         if(n%i === 0)
//         return i;
//         i++;
//     }
//     return 1;
// } 

// console.log(small(27))

//     Asked to reverse the words in a sentence.
// Find frequency of characters in a sentence and print in alphabetical order

function reverse(s){
    let a = s.split(" ");
    let ns = "";
    for(let i = a.length-1; i >= 0; i--){
        ns += " " + a[i];
    }
    return ns;
}

console.log(reverse("This is the It"))