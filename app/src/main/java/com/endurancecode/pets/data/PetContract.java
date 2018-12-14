package com.endurancecode.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * API Contract for the Pets app.
 */
public final class PetContract {

    /*
     * To prevent someone from accidentally instantiating the contract class,
     * make the constructor private.
     */
    private PetContract() {
    }

    /**
     * The "Content authority" is a name for the entire content provider, similar to the
     * relationship between a domain name and its website.  A convenient string to use for the
     * content authority is the package name for the app, which is guaranteed to be unique on the
     * device.
     */
    public static final String CONTENT_AUTHORITY = "com.endurancecode.pets";

    /**
     * Use CONTENT_AUTHORITY to create the base of all URI's which apps will use to contact
     * the content provider.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /**
     * Possible path (appended to base content URI for possible URI's)
     * For instance, content://com.example.android.pets/pets/ is a valid path for
     * looking at pet data. content://com.example.android.pets/staff/ will fail,
     * as the ContentProvider hasn't been given any information on what to do with "staff".
     */
    public static final String PATH_PETS = "pets";

    /* Inner class that defines the table contents */
    public static class PetEntry implements BaseColumns {

        /**
         * The content URI to access the pet data in the provider
         */
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        /**
         * Name of the database table for pets
         */
        public static final String TABLE_NAME = "pets";

        /**
         * Unique ID number for the pet (only for use in the database table
         * <p>
         * Type: INTEGER
         */
        public static final String _ID = BaseColumns._ID;

        /**
         * Name of the pet
         * <p>
         * Type: TEXT
         */
        public static final String COLUMN_PET_NAME = "name";

        /**
         * Breed of the pet
         * <p>
         * Type: TEXT
         */
        public static final String COLUMN_PET_BREED = "breed";

        /**
         * Gender of the pet
         * <p>
         * The only possible values are {@link #GENDER_UNKNOWN}, {@link #GENDER_MALE}
         * and {@link #GENDER_FEMALE}
         * <p>
         * Type: INTEGER
         */
        public static final String COLUMN_PET_GENDER = "gender";

        /**
         * Weight of the pet
         * <p>
         * Type: INTEGER
         */
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the gender of the pet
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}