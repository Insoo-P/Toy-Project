
export function loopFn(){
    // 1. for
    for(let i=0; i<5; i++){
        console.log("for : " + i)
    }

    // 2. while
    let i=0;
    while(i<5){
        console.log("while : " + i)
        i++
    }

    // 3. do while
    i=0;
    do {
        console.log('do while : ' + i)
        i++
    }while(i<5)

    // 4. for ... in (객체) 
    // key 값만 가져 올 수 있다.
    const obj = {
        a : "가",
        b : "나",
        c : "다"
    }
    for(const key in obj){
        console.log("for ... in (key): " + key)
        console.log("for ... in (value): " + obj[key])
    }

    // 5. for ... of (배열, iterable)
    // 5.1 배열
    const arr = ["가","나","다","라","마"]
    const entries = arr.entries();

    for(const [index, value] of entries){
        console.log('for ... of (index, value) : ' + [index, value])
    }

    // 5-2. iterable
    const iterableObj = {
        *[Symbol.iterator]() {
            yield "박";
            yield "인";
            yield "수";
        }
    };
    for(const value of iterableObj){
        console.log('for ... of (iterableObj) : ' + value)
    }

}



// for 문: 주어진 조건에 따라 특정 블록을 반복 실행합니다.

// javascript
// Copy code
// for (초기화; 조건; 증감) {
//     // 반복 실행될 코드
// }
// while 문: 조건이 참일 때까지 특정 블록을 반복 실행합니다.

// javascript
// Copy code
// while (조건) {
//     // 반복 실행될 코드
// }
// do...while 문: 먼저 한 번은 실행하고, 그 후에 조건이 참일 때까지 반복 실행합니다.

// javascript
// Copy code
// do {
//     // 반복 실행될 코드
// } while (조건);
// for...in 문: 객체의 열거 가능한 속성에 대해 반복 실행합니다.

// javascript
// Copy code
// for (변수 in 객체) {
//     // 반복 실행될 코드
// }
// for...of 문: 배열이나 iterable 객체의 요소에 대해 반복 실행합니다.

// javascript
// Copy code
// for (변수 of 배열 또는 iterable 객체) {
//     // 반복 실행될 코드
// }
// forEach() 메소드: 배열의 각 요소에 대해 지정된 함수를 실행합니다.

// javascript
// Copy code
// 배열.forEach(function(요소, 인덱스) {
//     // 실행될 코드
// });
// map() 메소드: 배열의 각 요소에 대해 지정된 함수를 실행하고, 그 결과를 새 배열에 담아 반환합니다.

// javascript
// Copy code
// const 새배열 = 배열.map(function(요소, 인덱스) {
//     // 실행될 코드
//     return 변환된_값;
// });