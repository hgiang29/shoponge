package com.shoponge.admin.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shoponge.common.entity.setting.Setting;
import com.shoponge.common.entity.setting.SettingCategory;

public interface SettingRepository extends CrudRepository<Setting, String> {
	public List<Setting> findByCategory(SettingCategory category);
}
