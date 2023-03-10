package io.learning.bookshop.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MembersController {
    @Autowired
    MembersService membersService;

    @GetMapping("/members")
    public List<Members> getAllMembers() {return membersService.getAllMembers();};

    @GetMapping("/members/{id}")
    public Optional<Members> getMembers(@PathVariable int id) {return membersService.getMembers(id);};

    @PostMapping("/members")
    public void addMembers(@RequestBody Members members) {membersService.addMembers(members);};

    @PutMapping("/members/{id}")
    public void updateMembers(@PathVariable int id, @RequestBody Members members) {membersService.updateMembers(id, members);};

    @DeleteMapping("/members/{id}")
    public void deleteMembers(@PathVariable int id) {membersService.deleteMembers(id);};
}
