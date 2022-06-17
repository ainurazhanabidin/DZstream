package com.company;

public enum Enam {

    BISHKEK{
        @Override
        void abstrak() {
            System.out.println("htdyt");

        }
    },
    NARYN{
        @Override
        void abstrak() {
            System.out.println("gfhgfgfc");
        }
    };

    abstract void abstrak();


}
