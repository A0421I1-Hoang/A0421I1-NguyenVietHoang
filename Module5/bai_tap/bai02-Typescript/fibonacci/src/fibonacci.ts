function fibonacci(num:number) {
    let a = 0;
    let b = 1;
    let next = 0;
    for (let i=0 ;i<num;i++) {
        if (i <= 1) {
            next = i
        } else {
            next = a + b;
            a = b;
            b = next
        }
    }
    return next
}
