package com.project9.Mediscreen_ClientUI.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project9.Mediscreen_ClientUI.beans.NoteBean;
import com.project9.Mediscreen_ClientUI.proxies.MicroserviceNotesProxy;

@Controller
public class NoteProxyController {

	private final MicroserviceNotesProxy notesProxy;

	public NoteProxyController(MicroserviceNotesProxy notesProxy) {
		this.notesProxy = notesProxy;
	}

	@GetMapping("/notes/list")
	public String notesList(Model model, String lastnameOfPatient) {
		List<NoteBean> notes = notesProxy.findByLastnameOfPatient(lastnameOfPatient);
		model.addAttribute("note", notes);
		return "note/list";
	}

	@GetMapping("/notes/add")
	public String addNote(NoteBean noteBean) {
		return "note/add";
	}

	@PostMapping("/notes/validate")
	public String validate(@Valid NoteBean noteBean, BindingResult result) {
		if (!result.hasErrors()) {
			notesProxy.validate(noteBean.getId(), noteBean.getLastnameOfPatient(), noteBean.getCommentary());
			return "redirect:/patients/list";
		}
		return "note/add";
	}

	@GetMapping("/notes/update/{id}")
	public String showUpdateForm(@PathVariable("id") String id, Model model) {
		NoteBean noteBean = notesProxy.showUpdateForm(id);
		model.addAttribute("note", noteBean);
		return "note/update";
	}

	@PostMapping("/notes/update/{id}")
	public String updateNote(@PathVariable("id") String id, @Valid NoteBean noteBean, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "note/update";
		}
		noteBean.setId(id);
		notesProxy.updateNote(noteBean.getId(), noteBean.getLastnameOfPatient(), noteBean.getCommentary());
		return "redirect:/notes/list";
	}

	@GetMapping("/notes/delete/{id}")
	public String deleteNote(@PathVariable("id") String id, Model model) {
		notesProxy.deleteById(id);
		return "redirect:/notes/list";
	}

}
