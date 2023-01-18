package com.project9.Mediscreen_ClientUI.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project9.Mediscreen_ClientUI.beans.NoteBean;

@FeignClient(name = "microservice-note", url = "localhost:8082")
public interface MicroserviceNotesProxy {

//	@GetMapping(value = "/notes/list")
	@RequestMapping(value = "/notes/list")
	List<NoteBean> findByPatientsName(String patientsName);

	@GetMapping("/notes/add")
	public String addNote(NoteBean noteBean);

	@PostMapping("/notes/validate")
	NoteBean validate(@RequestParam("id") Integer id, @RequestParam("patientsName") String patientsName,
			@RequestParam("commentary") String commentary);

}
