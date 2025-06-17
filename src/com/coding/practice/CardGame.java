package com.coding.practice;

import java.util.*;

public class CardGame {

    Map<String, Set<Integer>> numbersByKind = new HashMap<>();
    Map<Integer, Set<String>> kindsByNumber = new HashMap<>();

    public static void main(String[] args) {

        CardGame cardGame = new CardGame();

        System.out.println(cardGame.solution(new String[] {"S1", "S2", "S8", "D8", "H8", "D3"}));

    }

    public int solution(String [] datas) {
        int result = 0;
        for (String data : datas) {
            String kind = data.substring(0, 1);
            Integer number = Integer.valueOf(data.substring(1));

            Set<Integer> numbers = numbersByKind.getOrDefault(kind, new HashSet<>());
            numbers.add(number);
            numbersByKind.put(kind, numbers);

            Set<String> kinds = kindsByNumber.getOrDefault(number, new HashSet<>());
            kinds.add(kind);
            kindsByNumber.put(number, kinds);
        }

        List<String> allDiff = new ArrayList<>();



        for (Map.Entry<String, Set<Integer>> entry : numbersByKind.entrySet()) {
            int duplicationSize = entry.getValue().size();
            if (duplicationSize > 2) {
                result += duplicationSize * duplicationSize;
            } else if (duplicationSize == 1) {
                String candidate = entry.getKey() + entry.getValue().toArray()[0];
                if (isValid(candidate, allDiff)) {
                    allDiff.add(candidate);
                }
            }
        }

        for (Map.Entry<Integer, Set<String>> entry : kindsByNumber.entrySet()) {
            int duplicationSize = entry.getValue().size();
            if (duplicationSize > 2) {
                result += duplicationSize * duplicationSize;
            } else if (duplicationSize == 1) {
                String candidate = String.valueOf(entry.getValue().toArray()[0]) + entry.getKey();
                if (isValid(candidate, allDiff)) {
                    allDiff.add(candidate);
                }
            }
        }
        if (allDiff.size() > 2) {
            return result + allDiff.size() * allDiff.size();
        } else {
            return result;
        }
    }

    private boolean isValid(String candidate, List<String> arrDiff) {
        for (String value : arrDiff) {
            String kind = candidate.substring(0, 1);
            String number = candidate.substring(1);
            if (value.contains(number) || value.contains(kind)) {
                return false;
            }
        }
        return true;
    }
}
