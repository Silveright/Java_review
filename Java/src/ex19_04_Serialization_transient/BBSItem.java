package ex19_04_Serialization_transient;
//객체마다 고유하게 가진 값들이 직렬화 대상이된다.
//생성자, 메서드, 정적 필드는 직렬화 대상이 아니다.
//인스턴스 필드는 직렬화 대상이다.
//transient 키워드: 직렬화에서 제외 시킬 필드를 표시하는 키워드 //패스워드 같은 민감한 정보의 경우 제외시킬 필요가 있다.
//실행 순서: ObjectOutputExample3.java -> ObjectInputExample3
public class BBSItem implements java.io.Serializable{//게시물 클래스
	private static int itemNum =0;	//게시물의 수- 정적 필드는 직렬화 대상이 되지 않습니다.
	private String writer;	//글쓴이 - 인스턴스 필드는 직렬화 대상이 된다.
	private transient String password;//패스워드- 인스턴스 필드는 직렬화 대상이 된다.
									  //직렬화 대상이 되지 않는다.
	private String title;	//제목- 인스턴스 필드는 직렬화 대상이 된다.
	private String content; //내용- 인스턴스 필드는 직렬화 대상이 된다.
	
	//생성자는 직렬화 대상이 되지 않는다.
	BBSItem(String writer, String password, String title, String content){
		this.writer = writer;
		this.password = password;
		this.title = title;
		this.content = content;
		itemNum ++;
	}
	//메서드는 직렬화 대상이 되지 않는다.
	void modifyContent(String content, String password){
		if(!password.equals(this.password))
			return;
		this.content = content;
	}
	
	public String toString() {
		return "전체 게시물의 수: " + itemNum +
				"\n글쓴이: " + writer +
				"\n패스워드: " + password+
				"\n제목: " + title+ 
				"\n내용: " + content ; 
	}
}
