package io.learning.bookshop.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MembersService {
    @Autowired
    MembersRepository membersRepository;

    public List<Members> getAllMembers() {
        List<Members> members = new ArrayList<>();
        membersRepository.findAll().forEach(members::add);
        return members;
    }
    public Optional<Members> getMembers(int id) {
        return membersRepository.findById(id);
    }
    public void addMembers(Members members) {membersRepository.save(members);};
    public void updateMembers(int id, Members members) {membersRepository.save(members);};
    public void deleteMembers(int id) {membersRepository.deleteById(id);};
}
