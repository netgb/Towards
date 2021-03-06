package com.waitou.towards.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.waitou.towards.greendao.LogoImg;

import com.waitou.towards.greendao.LogoImgDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig logoImgDaoConfig;

    private final LogoImgDao logoImgDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        logoImgDaoConfig = daoConfigMap.get(LogoImgDao.class).clone();
        logoImgDaoConfig.initIdentityScope(type);

        logoImgDao = new LogoImgDao(logoImgDaoConfig, this);

        registerDao(LogoImg.class, logoImgDao);
    }
    
    public void clear() {
        logoImgDaoConfig.clearIdentityScope();
    }

    public LogoImgDao getLogoImgDao() {
        return logoImgDao;
    }

}
