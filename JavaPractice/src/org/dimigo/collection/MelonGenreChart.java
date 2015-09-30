package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>( );
		
		System.out.println("-------- << 멜론 장르별 챠트 >> --------");
		List<Music> sadSongs = new ArrayList<Music>();
		sadSongs.add(new Music("내 첫사랑", "베리굿"));
		sadSongs.add(new Music("또 다시 사랑", "임창정"));
		sadSongs.add(new Music("부산에 가면", "박진영"));
		map.put("발라드", sadSongs);
		
		List<Music> danceSongs = new ArrayList<Music>();
		danceSongs.add(new Music("커피", "유재환,김예림"));
		danceSongs.add(new Music("다 잘될거야", "쿨"));
		map.put("댄스", danceSongs);
		printMap(map);
		
		System.out.println("-------- << 발라드 3위 곡 변경 >> --------");
		sadSongs.set(2, new Music("지우고 지워도", "차수경"));
		map.replace("발라드", sadSongs);
		printMap(map);
		
		System.out.println("-------- << 발라드 1위 곡 삭제 >> --------");
		sadSongs.remove(0);
		map.replace("발라드", sadSongs);
		printMap(map);
		
		System.out.println("-------- << 전체 리스트 삭제 >> --------");
		map.clear();
		//printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		int num = 1;
		System.out.println("[발라드]");
		for(Music music : map.get("발라드")) {
			System.out.println(num++ + ". " + music);
		}
		
		num = 1;
		System.out.println("[댄스]");
		for(Music music : map.get("댄스")) {
			System.out.println(num++ + ". " + music);
		}
		System.out.println();
	}
}
