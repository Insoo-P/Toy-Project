package com.insoo.javapractice.etc;

/**
    T => Type
    K => Key
    V => Value
    E => Element(자료구조에 들어가는 원소들을 나타낼 때 사용함)
 */
public class Generic {
    public static void main(String[] args){

        // 제네릭 클래스 사용
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(10);
        System.out.println("Box value: " + integerBox.getValue());

        // 제네릭 메서드 사용
        Box.printValue("Hello, Generics!");

    }

    // 제네릭 클래스
    public static class Box<T> {
        private T value;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        // 제네릭 메서드
        public static <T> void printValue(T value) {
            System.out.println("Value: " + value);
        }
    }

}
