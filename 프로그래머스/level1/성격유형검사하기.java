package level1;

/**
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 1번 질문의 점수 배치는 아래 표와 같습니다.
 *
 * 선택지	성격 유형 점수
 * 매우 비동의	어피치형 3점
 * 비동의	어피치형 2점
 * 약간 비동의	어피치형 1점
 * 모르겠음	어떤 성격 유형도 점수를 얻지 않습니다
 * 약간 동의	네오형 1점
 * 동의	네오형 2점
 * 매우 동의	네오형 3점
 * 1번 질문에서는 지문의 예시와 다르게 비동의 관련 선택지를 선택하면 어피치형(A) 성격 유형의 점수를 얻고, 동의 관련 선택지를 선택하면 네오형(N) 성격 유형의 점수를 얻습니다.
 * 1번 질문에서 검사자는 약간 동의 선택지를 선택했으므로 네오형(N) 성격 유형 점수 1점을 얻게 됩니다.
 *
 * 2번 질문의 점수 배치는 아래 표와 같습니다.
 *
 * 선택지	성격 유형 점수
 * 매우 비동의	콘형 3점
 * 비동의	콘형 2점
 * 약간 비동의	콘형 1점
 * 모르겠음	어떤 성격 유형도 점수를 얻지 않습니다
 * 약간 동의	프로도형 1점
 * 동의	프로도형 2점
 * 매우 동의	프로도형 3점
 * 2번 질문에서 검사자는 약간 비동의 선택지를 선택했으므로 콘형(C) 성격 유형 점수 1점을 얻게 됩니다.
 *
 * 3번 질문의 점수 배치는 아래 표와 같습니다.
 *
 * 선택지	성격 유형 점수
 * 매우 비동의	무지형 3점
 * 비동의	무지형 2점
 * 약간 비동의	무지형 1점
 * 모르겠음	어떤 성격 유형도 점수를 얻지 않습니다
 * 약간 동의	제이지형 1점
 * 동의	제이지형 2점
 * 매우 동의	제이지형 3점
 * 3번 질문에서 검사자는 비동의 선택지를 선택했으므로 무지형(M) 성격 유형 점수 2점을 얻게 됩니다.
 *
 * 4번 질문의 점수 배치는 아래 표와 같습니다.
 *
 * 선택지	성격 유형 점수
 * 매우 비동의	라이언형 3점
 * 비동의	라이언형 2점
 * 약간 비동의	라이언형 1점
 * 모르겠음	어떤 성격 유형도 점수를 얻지 않습니다
 * 약간 동의	튜브형 1점
 * 동의	튜브형 2점
 * 매우 동의	튜브형 3점
 * 4번 질문에서 검사자는 매우 동의 선택지를 선택했으므로 튜브형(T) 성격 유형 점수 3점을 얻게 됩니다.
 *
 * 5번 질문의 점수 배치는 아래 표와 같습니다.
 *
 * 선택지	성격 유형 점수
 * 매우 비동의	네오형 3점
 * 비동의	네오형 2점
 * 약간 비동의	네오형 1점
 * 모르겠음	어떤 성격 유형도 점수를 얻지 않습니다
 * 약간 동의	어피치형 1점
 * 동의	어피치형 2점
 * 매우 동의	어피치형 3점
 * 5번 질문에서 검사자는 약간 동의 선택지를 선택했으므로 어피치형(A) 성격 유형 점수 1점을 얻게 됩니다.
 *
 * 1번부터 5번까지 질문의 성격 유형 점수를 합치면 아래 표와 같습니다.
 *
 * 지표 번호	성격 유형	점수	성격 유형	점수
 * 1번 지표	라이언형(R)	0	튜브형(T)	3
 * 2번 지표	콘형(C)	1	프로도형(F)	0
 * 3번 지표	제이지형(J)	0	무지형(M)	2
 * 4번 지표	어피치형(A)	1	네오형(N)	1
 * 각 지표에서 더 점수가 높은 T,C,M이 성격 유형입니다.
 * 하지만, 4번 지표는 1점으로 동일한 점수입니다. 따라서, 4번 지표의 성격 유형은 사전순으로 빠른 A입니다.
 *
 * 따라서 "TCMA"를 return 해야 합니다.
 *
 * 입출력 예 #2
 *
 * 1번부터 3번까지 질문의 성격 유형 점수를 합치면 아래 표와 같습니다.
 *
 * 지표 번호	성격 유형	점수	성격 유형	점수
 * 1번 지표	라이언형(R)	6	튜브형(T)	1
 * 2번 지표	콘형(C)	0	프로도형(F)	0
 * 3번 지표	제이지형(J)	0	무지형(M)	0
 * 4번 지표	어피치형(A)	0	네오형(N)	0
 * 1번 지표는 튜브형(T)보다 라이언형(R)의 점수가 더 높습니다. 따라서 첫 번째 지표의 성격 유형은 R입니다.
 * 하지만, 2, 3, 4번 지표는 모두 0점으로 동일한 점수입니다. 따라서 2, 3, 4번 지표의 성격 유형은 사전순으로 빠른 C, J, A입니다.
 *
 * 따라서 "RCJA"를 return 해야 합니다.
 */

import java.util.*;
public class 성격유형검사하기 {
    public static void main(String[] args) {

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        StringBuilder answer = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
        for(int i=0; i<choices.length; i++) {
            String[] name = survey[i].split("");
            switch (choices[i]) {
                case 1:
                    map.put(name[0], map.getOrDefault(name[0], 3)+3);
                    break;
                case 2:
                    map.put(name[0], map.getOrDefault(name[0], 2)+2);
                    break;
                case 3:
                    map.put(name[0], map.getOrDefault(name[0], 1)+1);
                    break;
                case 4:
                    break;
                case 5:
                    map.put(name[1], map.getOrDefault(name[1], 1)+1);
                    break;
                case 6:
                    map.put(name[1], map.getOrDefault(name[1], 2)+2);
                    break;
                case 7:
                    map.put(name[1], map.getOrDefault(name[1], 3)+3);
                    break;
            }
        }

        if(map.get("R") < map.get("T")) {
            answer.append("T");
        } else {
            answer.append("R");
        }

        if(map.get("C") < map.get("F")) {
            answer.append("F");
        } else {
            answer.append("C");
        }

        if(map.get("J") < map.get("M")) {
            answer.append("M");
        } else {
            answer.append("J");
        }

        if(map.get("A") < map.get("N")) {
            answer.append("N");
        } else {
            answer.append("A");
        }
        System.out.println(answer.toString());
    }
}
