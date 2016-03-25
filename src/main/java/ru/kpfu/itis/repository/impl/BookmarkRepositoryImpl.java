package ru.kpfu.itis.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.model.Bookmark;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.BookmarkRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by etovladislav on 25.03.2016.
 */
@Repository
public class BookmarkRepositoryImpl implements BookmarkRepository {

    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public void addBookmark(Bookmark bookmark) {
        em.persist(bookmark);
    }

    @Override
    public List<Bookmark> allUserBookmarks(User user) {
        return user.getBookmarks();
    }
}
