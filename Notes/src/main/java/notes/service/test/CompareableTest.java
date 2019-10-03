package notes.service.test;

import java.util.Date;

public class CompareableTest {
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
//	compare object
	public int compareTo(CompareableTest o) {
		if(this.createTime != null && o.getCreateTime() != null){
			return this.createTime.compareTo(o.getCreateTime());
		}else if(o.getCreateTime() == null && this.createTime == null){
			return 0;
		}else if(o.getCreateTime() == null && this.createTime != null){
			return 1;
		}else {
			return -1;
		}
	}
//	compare base
//	public int compareTo(CompareableTest o) {
//	if (this.id == o.getId()){
//        return 0;
//    }else if (this.id >o.getId()){
//        return 1;
//    }else {
//        return -1;
//    }
//	}
	
	
	public static void main(String[] args) {
//		Collections.sort(list) //list： 1 2 4 5 6 7 8
//		2、降序：
//		Collections.sort(list，Collections.reverseOrder())//list:8 7 6 5 4 2 1
//
//		3、逆序；
//		Collections.reverse(list)//list：4 1 8 6 2 7 5
	}
}
