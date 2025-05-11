package ru.yandex.practicum.contacts.presentation.main;

import androidx.annotation.NonNull;

import java.util.List;
import java.util.Objects;

import ru.yandex.practicum.contacts.model.ContactType;
import ru.yandex.practicum.contacts.presentation.base.ListDiffInterface;

public class ContactUi implements ListDiffInterface<ContactUi> {

    @NonNull
    private final String name;
    @NonNull
    private final String phone;
    @NonNull
    private final String photo;
    @NonNull
    private final List<ContactType> types;

    public ContactUi(
            @NonNull String name,
            @NonNull String phone,
            @NonNull String photo,
            @NonNull List<ContactType> types
    ) {
        this.name = Objects.requireNonNull(name);
        this.phone = Objects.requireNonNull(phone);
        this.photo = Objects.requireNonNull(photo);
        this.types = Objects.requireNonNull(types);
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getPhone() {
        return phone;
    }

    @NonNull
    public String getPhoto() {
        return photo;
    }

    @NonNull
    public List<ContactType> getTypes() {
        return types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactUi)) return false;
        ContactUi contact = (ContactUi) o;
        return name.equals(contact.name) &&
                phone.equals(contact.phone) &&
                photo.equals(contact.photo) &&
                types.equals(contact.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, photo, types);
    }

    @Override
    public boolean theSameAs(@NonNull ContactUi other) {
        return this.hashCode() == other.hashCode();
    }
}
