package com.br.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.br.chap01_list.part01_basic.model.vo.Music;

public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	{ // 초기화 블럭
	list.add(new Music("Attention", "Newjeans"));
	list.add(new Music("Fearless", "LE SSERAFIM"));
	list.add(new Music("Lovedive", "IVE"));
	}
	// 곡 추가 요청을 처리해주는 메소드
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	// 전체 곡 조회요청을 처리해주는 메소드
	public ArrayList<Music> selectMusic() {
		return list; 
	}
	
	/**
	 * 삭제 요청 처리해주는 메소드
	 * 
	 * @param title 사용자가 입력한 삭제할 곡 명
	 * @return 성공적으로 삭제시 1| 삭제할 곡을 못찾았을 때 0
	 * 
	 */
	
	public int deleteMusic(String title) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result++;
				break;
			}
			
		}
		
		// result == 0 (삭제할 곡을 못찾음) | 1 (성공적으로 삭제)
		return result;
		
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				// 방법1. ArrayList의 set메소드
				//list.set(i, new Music(upTitle, upArtist));
				
				// 방법2. 기존의 Music접근해서 setter메소드 필드 수정
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result++;
				
			}
		}
		
		// result == 0 (수정할 곡을 찾지 못했을 경우) | 1(성공적으로 수정)
		return result;
		
	}
	/*
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); // 검색된 Music객체들을 차곡차곡 담아줌
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				//System.out.println(list.get(i));
				searchList.add(list.get(i));
			}
		}
		
		// searchList == 텅비어있음 (검색결과 없었음) | 텅비어있지않을경우 (검색결과가 있음)
		return searchList;
	}
	*/
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); // 검색결과를 보관할 리스트
		
		if(menu == 1) { // 곡명으로 검색
			
			for(Music m : list) {
				if(m.getTitle().contains(keyword)) {
					searchList.add(m);
				}
			}	
			
		} else if (menu == 2) { // 가수명으로 검색
			
			for(Music m : list) {
				if(m.getArtist().contains(keyword)) {
					searchList.add(m);
				}
			}
			
		} else if (menu == 3) {	// 곡명 + 가수명으로 검색
			
			for(Music m : list) {
				if(m.getTitle().contains(keyword) || m.getArtist().contains(keyword)) {
					searchList.add(m);
				}
			}
			
		}	
		
		return searchList;
		
	}
	
}
