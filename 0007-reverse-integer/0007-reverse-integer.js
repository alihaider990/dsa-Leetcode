var reverse = function(x) {
    function reverseString(str) {
        return str.split("").reverse().join("");
    }

    let num = Math.abs(x);
    let str = String(num);
    let reversed = reverseString(str);
    let result = Number(reversed);

    result = result * Math.sign(x);

    if (result < -2147483648 || result > 2147483647) {
        return 0;
    }

    return result;
};