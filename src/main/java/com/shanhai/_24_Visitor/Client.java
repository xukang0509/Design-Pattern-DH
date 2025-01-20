package com.shanhai._24_Visitor;

/**
 * @description:
 * @author: xu
 * @date: 2025/1/20 21:55
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure.accach(new Man());
        ObjectStructure.accach(new Woman());

        ObjectStructure.display(new Success());

        ObjectStructure.display(new Failing());

        ObjectStructure.display(new Amativeness());

        ObjectStructure.display(new Marriage());
    }
}
