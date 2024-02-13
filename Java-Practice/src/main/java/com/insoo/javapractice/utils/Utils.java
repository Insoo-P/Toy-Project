package com.insoo.javapractice.utils;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class Utils {

    /*
        값으로 키 찾기: 맵에서 특정 값에 해당하는 키를 찾는 기능은 유용합니다. 위의 코드처럼 맵과 값을 인자로 받아 특정 값에 해당하는 키를 반환하는 메서드를 만들 수 있습니다.
        값으로 특정 엔트리 찾기: 맵에서 특정 값에 해당하는 엔트리를 찾는 기능도 유용합니다. 이러한 기능은 맵의 특정 값에 대응하는 키-값 쌍을 찾을 때 유용합니다.
        중복 제거: 리스트나 집합(Set)에서 중복된 요소를 제거하는 기능은 유용합니다. 이를 통해 중복된 요소를 제거하고 유니크한 요소만을 남길 수 있습니다.
        필터링: 리스트나 집합에서 특정 조건을 만족하는 요소만을 남기는 기능도 유용합니다. 이를 통해 리스트나 집합의 요소들을 조건에 따라 필터링할 수 있습니다.
        정렬: 컬렉션을 정렬하는 기능은 많은 경우에 유용합니다. 정렬 기준에 따라 요소를 정렬할 수 있습니다.
        맵 변환: 리스트나 집합을 맵으로 변환하거나 맵의 키나 값들을 리스트나 집합으로 변환하는 기능도 유용합니다.
        집합 연산: 두 개 이상의 집합에 대해 합집합, 교집합, 차집합 등의 연산을 수행하는 기능도 유용합니다.
        요소 변환: 리스트나 집합의 요소들을 특정 방식으로 변환하는 기능도 유용합니다. 이를 통해 요소들을 변환하거나 조작할 수 있습니다.
     */


    /**
     * Type Map → Value값으로 Key값 찾기
     * @param map
     * @param paramValue
     * @return K
     */
    public static <K, V, T> K findKeyByValue(Map<K, V> map, T paramValue){

        if (paramValue == null || map == null) {
            return null;
        }

        for (Entry<K, V> entrySet : map.entrySet()) {
            if (Objects.equals(paramValue, entrySet.getValue())){
                return entrySet.getKey();
            }
        }
        return null;
    }

    /**
     * Type Map → Value값으로 Entry값 찾기
     * @param map
     * @param paramValue
     * @return Entry<K, V>
     */
    public static <K, V, T> Entry<K, V> findEntryByValue(Map<K, V> map, T paramValue){
        if (paramValue == null || map == null) {
            return null;
        }

        for (Entry<K, V> entrySet : map.entrySet()) {
            if (Objects.equals(paramValue, entrySet.getValue())){
                return entrySet;
            }
        }
        return null;
    }

    /**
     * Type List → 중복제거
     */
//    public static void removeDuplicates(){
//        return
//    }
}
