package com.xuetang9.javabase.chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * ����ͼ�Ļ����÷�
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��9��5�� ����10:09:32
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		//Map�Ļ����÷�();		
		//����ͳ��javaԴ�ļ��У�ÿ���ؼ��ֳ��ֵĴ���
		ͳ�ƹؼ��ֳ��ֵĴ���();
	}
	
	public static void ͳ�ƹؼ��ֳ��ֵĴ���(){
		final String fileName = "src/com/xuetang9/javabase/chapter14/MapDemo.java";
		final String keywords = "package, import, public, class, void, final, static, new, while, if, catch, for, try, return";
		//1�����JavaԴ�ļ��е��ַ������еļ��ϡ�StringBuffer��
		List<String> contentList = ReadSourceFile(fileName);
		Set<String> keywordsSet = new HashSet<>();	
		keywordsSet.addAll(Arrays.asList(keywords.split(",")));
		//String[] keywordsArray = keywords.split(",");	//�򵥵�����	
		//2�������ؼ��ּ��ϣ�ͳ��ÿһ���ؼ�����Դ�ļ��ַ����г��ֵĴ��� - ���ؼ��ֺʹ����Լ�-ֵ�ķ�ʽ�����Map������
		Map<String, Integer> keywordsMap = new HashMap<>();
		for(String keyword : keywordsSet){//��ѭ�������ؼ��ּ���
			keyword = keyword.trim();
			for(String line : contentList){//��ѭ��-ÿ���ؼ��ֶ�����һ��Դ���������
				//ͳ��ÿһ���У�keyword���ֵĴ��� (�����ۼ�)
				//int num1 = 0;	int num2 = 0; int num3 = 0;
				int count = getLineKeywordCount(line, keyword);
				if(count == 0) continue;
				//��count�ŵ�map������
				if(keywordsMap.containsKey(keyword)){
					int oldCount = keywordsMap.get(keyword).intValue();
					keywordsMap.put(keyword, new Integer(count + oldCount));
				}else{
					keywordsMap.put(keyword, count);//�ؼ��ֵ�һ�γ��֣�ֱ����Ӽ���
				}
			}
		}
		//3������Map���ϣ��Թؼ��ֳ��ֵĴ���������
		for(Entry<String, Integer> entry : keywordsMap.entrySet()){
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		//������ʾ
		System.out.println("-------------------------------------------------");
		Map<String, Integer> treeMap = new TreeMap<>(new MyTreeComparator(keywordsMap));
		treeMap.putAll(keywordsMap);
		for(Entry<String, Integer> entry : treeMap.entrySet()){
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
	}
	/**
	 * ͳ����һ�У�line���У�keyword���ֵĴ���
	 * @param line
	 * @param keyword
	 * @return
	 */
	private static int getLineKeywordCount(String line, String keyword){
		if(null == line || line.length() == 0) return 0;
		//������������������߼��жϣ�����ע����
		if(line.startsWith("/*") || line.startsWith("*") || line.startsWith("*/") || line.startsWith("//")){
			return 0;
		}
		int count = 0;
		//int num1 = 0;	int num2 = 0; int num3 = 0;
		String strLine = new String(line);
		int index = -1;
		while((index = strLine.indexOf(keyword)) != -1){
			count++;
			strLine = strLine.substring(index + keyword.length() + 1);
		}
		return count;
	}
	
	/**
	 * ��ȡ����·����JavaԴ�ļ������ַ����ķ�ʽ����Դ�ļ�����������
	 * @param fileName
	 * @return
	 */
	private static List<String> ReadSourceFile(String fileName){
		List<String> contentList = new ArrayList<>();
		try(
			FileReader freader = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(freader);
		){
			String line = null;
			while((line = reader.readLine()) != null){
				if(line.trim().length() == 1) continue;
				contentList.add(line.trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contentList;
	}
	
	public static void Map�Ļ����÷�(){
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Monkey��D��Luffy", 18);
		hashMap.put("Nami", 19);
		hashMap.put("Sanji", 25);
		hashMap.put("Nico Robin", 26);
		hashMap.put("Roronoa Zoro", 21);
		System.out.println("hashmap:" + hashMap);
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Monkey��D��Luffy", 18);
		linkedHashMap.put("Nami", 19);
		linkedHashMap.put("Sanji", 25);
		linkedHashMap.put("Nico Robin", 26);
		linkedHashMap.put("Roronoa Zoro", 21);
		System.out.println("linkedHashMap:" + linkedHashMap);
		Map<String, Integer> treeMap = new TreeMap<>(new MyTreeComparator(hashMap));
		treeMap.putAll(hashMap);
//		treeMap.put("Monkey��D��Luffy", 18);
//		treeMap.put("Nami", 19);
//		treeMap.put("Sanji", 25);
//		treeMap.put("Nico Robin", 26);
//		treeMap.put("Roronoa Zoro", 21);
		System.out.println("treeMap:" + treeMap);
		
		System.out.println("��һ�ֱ�����ʽ��ͨ��Map.keySet����key��ͨ��keyȡ����Ӧ��value - �Ƚϳ��ã���Ҫ����ȡֵ");
		for(String key : treeMap.keySet()) {
			System.out.println(key + " -- " + treeMap.get(key));
		}
		
		System.out.println("�ڶ��ֱ�����ʽ��ͨ��Map.entrySetʹ�õ���������key��value");
		Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
		Iterator<Map.Entry<String, Integer>> entrySetIt = entrySet.iterator();
		while(entrySetIt.hasNext()){
			Map.Entry<String, Integer> entry = entrySetIt.next();
			System.out.println(entry.getKey() + "\t\t" + entry.getValue());
		}
		
		System.out.println("�����ֱ�����ʽ��ֱ�ӱ���Map.entrySet���� - ������ʱ���Ƽ�ʹ�ñ���������map");
		for(Entry<String, Integer> entry : treeMap.entrySet()){
			System.out.println(entry.getKey() + "  ==  " + entry.getValue());
		}
		
	}
	
}
/**
 * �����Լ�����ıȽ���
 * ע�⣺Ĭ������£�Map�ıȽ���ֻ�ܶ�key��������
 * ����ֵ�Ƚϣ���Ҫ�Զ�������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��9��5�� ����12:16:01
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
class MyTreeComparator implements Comparator<String>{
	private Map<String, Integer> map;
	public MyTreeComparator(Map<String, Integer> map) {
		this.map = map;
	}

	@Override
	public int compare(String key1, String key2) {
//		if(key1.compareTo(key2) > 0) return -1;
//		if(key1.compareTo(key2) < 0) return 1;
		//����valueֵ���бȽ�
		if(map.get(key1).intValue() < map.get(key2).intValue()){
			return 1;
		}
		if(map.get(key1).intValue() > map.get(key2).intValue()){
			return -1;
		}
		return 0;
	}
	
}







































//	public static void Map�Ļ����÷�(){
//		//�����÷�
//		Map<String, Integer> hashMap = new HashMap<String, Integer>();
//		hashMap.put("Monkey��D��Luffy", 18);
//		hashMap.put("Nami", 19);
//		hashMap.put("Sanji", 25);
//		hashMap.put("Nico Robin", 26);
//		hashMap.put("Roronoa Zoro", 21);
//		//����Map
//		System.out.println("Sanji�����䣺" + hashMap.get("Sanji"));
//		System.out.println("���ļ��ϣ�");
//		for(String key : hashMap.keySet()){
//			System.out.print(key + ", ");
//		}
//		System.out.println();
//		System.out.println("ֵ�ļ��ϣ�");
//		for(Integer value : hashMap.values()){
//			System.out.print(value + ", ");
//		}
//		System.out.println();
//		
//		System.out.println("��һ�ֱ�����ʽ��ͨ��keySet����key��value(�ձ�ʹ�õģ�ȱ������Ҫ����ȡֵ)");
//		for(String key : hashMap.keySet()){
//			System.out.println(key + ", " + hashMap.get(key));
//		}
//		
//		System.out.println("�ڶ��ַ�ʽ��ͨ��Map.entrySetʹ�õ���������key��value");
//		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
//		Iterator<Entry<String, Integer>> it = entrySet.iterator();
//		while(it.hasNext()){
//			Entry<String, Integer> entry = it.next();//ȡ��Map�е�һ����ֵ��  ����
//			//�ֱ��ӡ����ֵ
//			System.out.println(entry.getKey() + ", " + entry.getValue());
//		}
//		
//		System.out.println("�����ַ�ʽ��ֱ�ӱ���Map.entrySet -- ����������ʱ���Ƽ�ʹ��");
//		for(Entry<String, Integer> entry : hashMap.entrySet()){
//			System.out.println(entry.getKey() + ", " + entry.getValue());
//		}
//		
//		
//		//TreeMap -- ����ϣ��ʹ��valueֵ������
//		Map<String, Integer> treeMap = new TreeMap<>(new MyComparator(hashMap));
//		treeMap.putAll(hashMap);
//		System.out.println("����TreeMap:");
//		for(Entry<String, Integer> entry : treeMap.entrySet()){
//			System.out.println(entry.getKey() + ", " + entry.getValue());
//		}
//		
//		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//		linkedHashMap.putAll(treeMap);
//		System.out.println("����LinkedHashMap:");
//		for(Entry<String, Integer> entry : linkedHashMap.entrySet()){
//			System.out.println(entry.getKey() + ", " + entry.getValue());
//		}
//	}
//	
//	
/**
 * �Զ���Ƚ���������ͨ��value��������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��9��5�� ����10:33:47
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
//class MyComparator implements Comparator<String>{
//	Map<String, Integer> map;
//	
//	public MyComparator(Map<String, Integer> map) {
//		this.map = map;
//	}
//
//	@Override
//	public int compare(String o1, String o2) {
//		//ͨ������ļ����ҵ���Ӧ��value���бȽ�
//		if(map.get(o1) > map.get(o2)) return 1;
//		if(map.get(o1) < map.get(o2)) return -1;
//		return 0;
//	}
//}
//	
//	
//	
//	
//	
	
	
	
	
	
	
//	public static void ͳ��JavaԴ���еĹؼ��ֳ��ֵĴ���(){
//	//��ǰҪ��ȡ��JavaԴ�ļ�
//	final String fileName = "src/com/xuetang9/javabase/chapter14/MapDemo.java";
//	//Ҫͳ�ƵĹؼ���
//	String keywords = "package, import, public, class, void, final, null, new, try, catch, for, static, if, while";
//	//ʹ��io����ȡjavaԴ�ļ�
//	//1.�ȴ��ļ��ж�ȡ�����е��У�������ӵ�StringBuffer(StringBuilder)�У����Է�װ�ɵ����ķ�����
//	StringBuffer content = new StringBuffer();
//	try (
//		FileReader freader = new FileReader(fileName);
//		BufferedReader reader = new BufferedReader(freader);
//	){
//		String line = null;
//		while((line = reader.readLine()) != null){
//			content.append(line);
//			content.append(System.getProperty("line.separator"));//ÿ��ĩβ��ӷָ��������������ѭ���ж�
//		}
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	//2.��ͳ��StringBuffer�еĹؼ��ּ����ֵĴ���
//	Map<String, Integer> keywordsMap = new HashMap<>();
//	Map<String, Integer> keywordsMap_Sorted = new TreeMap<>(new MyComparator(keywordsMap));
//	//�ؼ�������-ʹ�ö��ŷָ�
//	String[] keywordsArray = keywords.split(",");
//	//����Դ���е�ÿһ��
//	String[] contentArray = content.toString().split(System.getProperty("line.separator"));
//	for (int i = 0; i < keywordsArray.length; i++) {//����ÿһ���ؼ���
//		//ͳ��ÿһ���ؼ�������ƪ�ĵ��г��ֵĴ���
//		String keyword = keywordsArray[i].trim();	//ȡ��ĳ���ؼ���
//		for (int j = 0; j < contentArray.length; j++) {
//			String line = contentArray[j].trim();	//ȡ��ĳһ��
//			if(!line.contains(keyword)) continue;
//			//��ȡ����һ�У�line����keyword���ֵĴ��� - ��װ�ɷ�������������Ĵ�����
//			int count = getLineKeyWordsCount(line, keyword);
//			if(count == 0) continue;//���û�йؼ��֣��ͼ����ж���һ��
//			if(keywordsMap.get(keyword) != null){//����ؼ���Map���Ѱ����˹ؼ���
//				//���ؼ��ֵĴ���ȡ����+count
//				int oldCount = keywordsMap.get(keyword).intValue();
//				keywordsMap.put(keyword, new Integer(oldCount + count));
//			}else{//����ؼ��ֲ����ڣ���ֱ����Ӽ���
//				keywordsMap.put(keyword, new Integer(count));
//			}
//			
//		}
//	}
//	
//	System.out.println("ÿ���ؼ��ֳ��ֵĴ�����");
//	for(Entry<String, Integer> entry : keywordsMap.entrySet()){
//		System.out.println(entry.getKey() + " -- " + entry.getValue());
//	}
//	
//}
//
///**
// * ��ȡline��keyword���ֵĴ���
// * @param line
// * @param keyword
// * @return
// */
//private static int getLineKeyWordsCount(String line, String keyword){
//	if(null == line || line.length() == 0) return 0;
//	//�������й涨һ���߼�
//	//���磺����ע����
//	if(line.startsWith("//") || line.startsWith("/*") || line.endsWith("*/") || line.startsWith("* @")){
//		return 0;
//	}
//	int count = 0;
//	//int count = 0;	int count1 = 0;		int count2 = 0;
//	String lineStr = new String(line);	//Ϊ�˽�ȡ���㣬���¹���lineStr
//	int index = -1;
//	while((index = lineStr.indexOf(keyword)) != -1){
//		count++;
//		lineStr = lineStr.substring(index + keyword.length() + 1);
//	}	
//	return count;
//}
//







