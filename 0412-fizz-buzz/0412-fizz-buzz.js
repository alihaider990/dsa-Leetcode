/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {
    const result = [];
    for(let i = 1; i <= n; i++){
        let s ="";
        if (i % 3 === 0) s += "Fizz";
        if (i % 5 === 0) s += "Buzz";
        result.push(s || String(i));
    }
    return result;
    
}