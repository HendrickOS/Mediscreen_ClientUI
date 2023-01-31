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

	@RequestMapping(value = "/notes")
	List<NoteBean> findByLastnameOfPatient(@RequestParam("lastnameOfPatient") String lastnameOfPatient);

	@GetMapping("/notes/add")
	public String addNote(NoteBean noteBean);

	@PostMapping("/notes/validate")
	NoteBean validate(@RequestParam("id") String id, @RequestParam("lastnameOfPatient") String lastnameOfPatient,
			@RequestParam("commentary") String commentary);
//	NoteBean validate(@RequestParam("id") ObjectId id, @RequestParam("lastnameOfPatient") String lastnameOfPatient,
//			@RequestParam("commentary") String commentary);

	@GetMapping("/notes/update/{id}")
	public NoteBean showUpdateForm(@RequestParam("id") String id);
//	public NoteBean showUpdateForm(@RequestParam("id") ObjectId id);

	@PostMapping("/notes/update/{id}")
	NoteBean updateNote(@RequestParam("id") String id, @RequestParam("lastnameOfPatient") String lastnameOfPatient,
//	NoteBean updateNote(@RequestParam("id") ObjectId id, @RequestParam("lastnameOfPatient") String lastnameOfPatient,
			@RequestParam("commentary") String commentary);

	@GetMapping("/notes/delete/{id}")
	void deleteById(@RequestParam("id") String id);
//	void deleteById(@RequestParam("id") ObjectId id);

}
