package homework.homework.Test.C05;

    // 대문자는 소문자로, 소문자는 대문자로 변환하시오
    // ex ) helloWorlD  => HELLOwORLd
    // 사용 태그 배열, for, if
public class CO5test {
    public static void main(String[] args) {

        String input = "helloWorldD";
        // 문자열로 받을 땐 항상 String 으로.
        input.toCharArray();
        char[] arr;
        // input 에 담겨있는 문자열을 캐릭터배열로 반환해서 arr이름의 파일에 담았다.
        arr = input.toCharArray();

        for (int i= 0; i< arr.length; i++){
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                // arr[]배열에 담은 정보를 for 문으로 하나씩 돌려보면서
                // arr[] 에 담은 단어가 a 와 같거나 크고 z 와 같거나 작으면
                arr[i] = (char) (arr[i]+ 'A'-'a');
            } else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i]- ('A'-'a'));
            }
        }
        System.out.println(arr);

    }
}
