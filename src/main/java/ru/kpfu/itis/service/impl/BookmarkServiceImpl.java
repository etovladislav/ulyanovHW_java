package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.model.Bookmark;
import ru.kpfu.itis.model.User;
import ru.kpfu.itis.repository.BookmarkRepository;
import ru.kpfu.itis.service.BookmarkService;

/**
 * Created by Ильгиз on 24.03.2016.
 */
@Service
public class BookmarkServiceImpl implements BookmarkService {

    @Autowired
    BookmarkRepository bookmarkRepository;

    @Override
    public void addBookmark(Bookmark bookmark) {
        bookmarkRepository.addBookmark(bookmark);
    }
}
