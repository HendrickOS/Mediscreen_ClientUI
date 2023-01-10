package com.project9.Mediscreen_ClientUI.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project9.Mediscreen_ClientUI.beans.NoteBean;

@FeignClient(name = "microservice-note", url = "localhost:8082")
public interface MicroserviceNotesProxy {

//	@GetMapping(value = "/notes/list")
	@RequestMapping(value = "/notes/list")
	List<NoteBean> notesList();

}
