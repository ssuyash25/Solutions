
function anagram(s){
    let ans = {}
}

function anagrams(s,a){
    if(s.length !== a.length){
        return false;
    }
    let flag = true;
    let s1 = {};
    let s2 = {};
    for(let i=0; i<s.length;i++){
      s1[s[i]] = s1[s[i]] ? s1[s[i]] + 1: 1;
      s2[a[i]] = s2[a[i]] ? s2[a[i]] + 1: 1;
    }
    for(let i=0; i<s.length;i++){
      if(s1[s[i]] !== s2[s[i]]){
          flag = false;
          break;
      }
    }
    return flag;
}