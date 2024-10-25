package org.example.sort;


public interface Sort {
    //'정렬'의 여러 종류(is-a)로 보아 상속으로 구현할 수 있지만
    // "여러 정렬 알고리즘이 '정렬'이라는 동일한 기능을 수행한다"(can-do)에 초점을 두고 인터페이스로 작성
    public static final Integer[] arr = new Integer[]{9,8,7,6,5,4,3,2,1,0};

    public abstract Integer[] sort(Integer[] arr);

}
