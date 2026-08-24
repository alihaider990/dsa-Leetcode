
var reverseOnlyLetters = function(s) {
    let arr = s.split('');
    let left = 0;
    let right = arr.length - 1;

    
    const isLetter = (char) => /[a-zA-Z]/.test(char);

    while (left < right) {
        if (!isLetter(arr[left])) {
            left++;
        } else if (!isLetter(arr[right])) {
            right--;
        } else {
            
            let temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    return arr.join('');
};