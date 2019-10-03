/**@Title: RepositoryTest.java 
 * @Package com.brt.license.test.RepositoryTest 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xuanweilun 
 * @date 2019年8月26日 下午3:18:47 
 * @version V1.0   
 */

package notes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


/** 
 * @ClassName RepositoryCreator 
 * @Description Repository 自动创建工具
 * @date 2019年9月29日 
 */
public class RepositoryCreator {
	
	/*
	 * 使用方法：
	 * 	1.将本文件放入Entity包和Repository包的同一层包
	 *  2.修改creator（创建人）名
	 *  3.运行本文件
	 *  4.刷新项目
	 *  
	 * */
	 
	private static final String creator = "RepositoryCreator";

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		RepositoryCreator.startCreateRepositorys();
	}
	
	public static void startCreateRepositorys() {
		Long startTime = System.currentTimeMillis();
		System.out.println("-----------------------------------------");
		System.out.println("-- 开始创建: "+new SimpleDateFormat("yyyy年MM月dd日 下午HH:mm:SS").format(new Date(startTime)));
		//1.get filePath
		Package pa = RepositoryCreator.class.getPackage();
		RepositoryCreatorPackageName = pa.getName();
		String packagePath = pa.getName().replace(".", "\\");
		packagePath = System.getProperty("user.dir")+"\\src\\main\\java\\"+packagePath;
		//2.get entity path
		createRepositorys(packagePath+"\\entity",packagePath+"\\repository");
		Long endTime = System.currentTimeMillis();
		System.out.println("-- 创建完成: "+new SimpleDateFormat("yyyy年MM月dd日 下午HH:mm:SS").format(new Date(endTime)));
		System.out.println("-----------------------------------------");
		System.out.println("-- 创建个数: "+ repositoryNum + " 个");
		Long spareTime = endTime - startTime;
		System.out.println("-- 创建耗时: "+ spareTime + " ms");
	}

	private static void createRepositorys(String entityPath,String repositoryPath) {
		if (null == entityPath || "".equals(entityPath)) {
			System.err.println("目录不能为空");
			return;
		}
		// get file list where the path has
		File dir = new File(entityPath);
		for (File file1:dir.listFiles()) {
			if (file1.isFile()) {
				String classAllName = file1.getPath();
				createRepository(repositoryPath,classAllName);
			} else if (file1.isDirectory()) {
				String repoPath = repositoryPath + file1.getPath().replace(entityPath,"");
				createRepositorys(file1.getPath(),repoPath);
			}
		}
	}

	private static void createRepository(String outputFilePath, String className) {
		if (null == outputFilePath || "".equals(outputFilePath)) {
			System.err.println("目录不能为空");
			return;
		}
		//1.get value
		String packageName = outputFilePath.replace("\\",".");
		packageName = packageName.substring(packageName.indexOf(RepositoryCreatorPackageName),packageName.length());
		className = className.substring(className.indexOf(RepositoryCreatorPackageName), className.lastIndexOf(".")).replace("\\", ".");
		String classSimpleName = className.substring(className.lastIndexOf(".")+1,className.length());
		//2.set content
		String contentCopy = new String(content);
		content = content.replace("className",className);
		content = content.replace("packageName", packageName);
		content = content.replace("classSimpleName", classSimpleName);
		content = content.replace("time",time);
		content = content.replace("creator", creator);
		//3.out put
		try {
			File file = new File(outputFilePath);
			if(!file.exists()) {
				file.mkdirs();
			}
			//
			file = new File(outputFilePath+"\\"+classSimpleName+"Repository.java");
			OutputStream out = new FileOutputStream(file);
			try {
				out.write(content.getBytes());
				out.flush();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//
		repositoryNum++;
		content = contentCopy;
	}
	
	private static String content = "package packageName;\n\n\n" 
			+"import org.springframework.data.jpa.repository.JpaRepository;\n\n"
			+ "import className;\n\n\n\n" 
			+"/**\n"
			+ " * @ClassName: classSimpleNameRepository\n"
			+ " * @Description: TODO(这里用一句话描述这个类的作用)\n"
			+ " * @author creator\n"
			+ " * @date time\n"
			+ " */\n"
			+"public interface classSimpleNameRepository extends JpaRepository<classSimpleName, Long>{"
			+ "\n\n}";
	
	private static final String dateTime = new SimpleDateFormat("yyyy年MM月dd日 下午HH:mm:SS").format(new Date());
	private static final String time = dateTime.substring(0,dateTime.length()-1); 
	private static String RepositoryCreatorPackageName = "";
	private static int repositoryNum;

}
