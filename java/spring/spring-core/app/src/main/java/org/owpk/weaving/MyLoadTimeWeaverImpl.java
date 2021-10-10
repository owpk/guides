package org.owpk.weaving;

import org.springframework.instrument.classloading.LoadTimeWeaver;

import java.lang.instrument.ClassFileTransformer;

// динамическое переплетение классов во время загрузки
public class MyLoadTimeWeaverImpl implements LoadTimeWeaver {

    @Override
    public void addTransformer(ClassFileTransformer transformer) {
    }

    @Override
    public ClassLoader getInstrumentableClassLoader() {
        return null;
    }

    @Override
    public ClassLoader getThrowawayClassLoader() {
        return null;
    }
}
