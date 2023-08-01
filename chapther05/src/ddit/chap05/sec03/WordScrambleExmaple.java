package ddit.chap05.sec03;
//5개의 단어를 배열에 저장한 후 임의의 한 단어를 선택한다.
//선택된 단어의 철자를 섞어 사용자에게 제시한다.
//사용자는 제시된 철자들을 보고 원래의 단어를 맞추는 게임
//시도 횟수도 출력



public class WordScrambleExmaple {

	public static void main(String[] args) {
		
		WordScramble ws =new WordScramble();
		String str = ws.getWord(); //정답 단어
		String question=ws.shuffle(str); //제시어
		System.out.println("제시어 : "+question);
		ws.answer(str); 
	}

}
