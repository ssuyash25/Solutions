
//Strings are immutable in JS

function reverseString(s){
    let s1=""
    let i =0;
    while(i < s.length){
        s1 = s[i]+s1;
        i++;
    }
    return s1;
}

function reverseString1(s){
    let s1="", s2 ="";
    const l = s.length;
    let mid = l % 2 === 0 ? l/2: (l-1)/2;
    let i =0;
    while(i < mid){
        s1 = s1+s[(l-1)-i];
        s2 = s[i]+s2;
        i++;
    }
    return l % 2 === 0 ? s1+s2 : s1+s[mid]+s2;
}

function reverseString2(str) {
    // Step 1. Use the split() method to return a new array
    // ["h", "e", "l", "l", "o"]
    // Step 2. Use the reverse() method to reverse the new created array
    // ["o", "l", "l", "e", "h"]
    // Step 3. Use the join() method to join all elements of the array into a string
    // "olleh"
    //Step 4. Return the reversed string
    return str.split("").reverse().join("");
}

// Recursion
function reverseString3(str) {
    if (str === "") // This is the terminal case that will end the recursion
      return "";
    else
      return reverseString(str.substr(1)) + str.charAt(0);
}

console.log(reverseString("GEEKS"));
console.log(reverseString1("GEEKS"));
console.log(reverseString2("HELLO"));
console.log(reverseString3("GEEKS"));